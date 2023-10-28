import os
def LoadPaddedData(path):
    print(f"Attempting to load padded file {path}...")
    try:
        with open(path, 'rb') as file:
            data = bytearray(file.read())   # Dump bytes into an array
            print(f"Padded file {path} successfully opened with {len(data)} bytes.")
            file.close()
        return data
    except FileNotFoundError:
        print(f"Padded file {path} could not be found.")
        ExitState()
    except Exception as error:
        print(f"Script ran into an error while reading padded data {str(error)}")
        file.close()
        ExitState()

def SaveDepaddedData(path):
    print(f"Attempting to save unpadded file {path}...")
    try:
        with open(path, 'wb') as file:
            file.write(data[3::4])  # Save only every 4th byte
            print(f"File {path} successfully saved with {int((len(data))/4)} bytes.")
            file.close()
    except Exception as error:
        print(f"Script ran into an error while saving data {str(error)}")
        file.close()
        ExitState()

def ExitState():
    input("Press enter to continue...")
    exit()

# Set our working directory to the same path as this script.
abspath = os.path.abspath(__file__)
dirname = os.path.dirname(abspath)
os.chdir(dirname)

# Suck our own dick
print("Sonic 1 J2ME level data depadder written by Kilo")

try:
    with open('Padded Files.txt', 'r') as file_list:    # Load list of padded files
        file_array = file_list.readlines()
        file_list.close()
except FileNotFoundError:
    print("File list could not be found.")
    ExitState()
except Exception as error:
    print(f"Script ran into an error while reading file list {str(error)}")
    file_list.close()
    ExitState()

# Now we go through and load, depad, and save the files.
i = 0
while i < len(file_array):
    # We have to remove the last character of the path in the array because readlines adds a newline command
    # But not on the last entry thus this if statement.
    if i != (len(file_array))-1:
        file_array[i] = file_array[i][:-1]
    data = LoadPaddedData("../data/levels/" + str(file_array[i]))
    SaveDepaddedData("depadded_" + str(file_array[i]))
    i += 1

ExitState()