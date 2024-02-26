import os
def LoadJ2MEData(path):
    print(f"Attempting to load J2ME level data {path}...")
    try:
        with open(path, 'rb') as file:
            data = bytearray(file.read())	# Dump bytes into an array
            print(f"J2ME level data {path} successfully opened.")
            file.close()
        return data
    except FileNotFoundError:
        print(f"J2ME level data {path} could not be found.")
        ExitState()
    except Exception as error:
        print(f"Script ran into an error while reading J2ME level data {str(error)}")
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
print("Sonic 1 J2ME to MD level data converter written by Kilo")

try:
    with open('Depadded Files.txt', 'r') as file_list:    # Load list of files
        file_array = file_list.readlines()
        file_list.close()
except FileNotFoundError:
    print("File list could not be found.")
    ExitState()
except Exception as error:
    print(f"Script ran into an error while reading file list {str(error)}")
    file_list.close()
    ExitState()