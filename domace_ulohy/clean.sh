#!/bin/sh
for i in $(ls -d */); 
do 
#	echo ${i%%/}; 
	
	cmd="rm -rvf ${i%%/}/*/.idea"
	eval $cmd

	cmd="rm -rvf ${i%%/}/*/.DS_Store"
	eval $cmd 

	cmd="rm -rvf ${i%%/}/*/.im*"
	eval $cmd 

done
