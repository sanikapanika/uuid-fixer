## fixuuid

Fixes malformed uuids. Available from terminal using command `fixuuid`.
No magic involved, only strings with length 32 or binary uuids like `0xd2aefbd23a8a420293ceb0d6ce167507` are accepted.
It's basically a formatter dunno.

![](https://media.giphy.com/media/VDZGIv1V4tbrLk1TzQ/giphy.gif)

## 1. Setup

### 1.1 Auto
1. Clone the repo
2. Run `sudo bash install.sh` (scared of sudo? take a look at the script it's safe i even tested it once)

### 1.2 Manual (control freaks)
1. Clone the repo
2. Open a terminal and type `javac FixUuid.java` in the project root
3. Copy the generated `FixUuid.class` to anywhere, just copy the path you put it in (you can leave it where it is just get the path with `pwd`)
4. Navigate to `/usr/local/bin`
5. Create a file named `fixuuid` or whatever there (that's the name of the command you're giving)
6. Paste the script below
7. Finally type `sudo chmod a+x fixuuid`

Script:
```shell script
#!/usr/bin/env bash

java --class-path=<FixUuid.class location> FixUuid $1
``` 

## Usage
```shell script
$ fixuuid <string>
```

## Suggestion
Use [yakuake](https://kde.org/applications/system/org.kde.yakuake) with this and [uuid-generator](https://github.com/sanikapanika/uuid-generator) to make your life easier.

NOTE: yakuake is for KDE only, for GNOME (usually ubuntu users) google yakuake dropdown terminal alternative for GNOME. 
