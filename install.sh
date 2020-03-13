# compile
javac FixUuid.java
# create a home for the compiled class
mkdir -p /usr/local/lib/fixuuid
# move the compiled class
mv FixUuid.class /usr/local/lib/fixuuid
# check if already installed, if yes delete and update
if [ -e /usr/local/bin/fixuuid ]
then
  rm /usr/local/bin/fixuuid
fi
# create runner so you can simply call the compiled class
echo 'java --class-path=/usr/local/lib/fixuuid FixUuid $1' >> /usr/local/bin/fixuuid
# make executable
chmod a+x /usr/local/bin/fixuuid