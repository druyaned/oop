#!/bin/bash
# 
# Copies all diagrams of Design Patterns.
# See directory 'diagrams/'.
# 
( rm -rf diagrams ) && echo "directory 'diagrams/' is cleared and removed";
diagrams=( $(find src/main/java -name "*.png") );
for diagram in ${diagrams[@]}; do
    link_file=${diagram#*/designpatterns/};
    link_file=diagrams/${link_file%/*/*.png}/${link_file#*/*/};
    file_parent=${link_file%/*};
    if [[ ! -d $file_parent ]]; then
        ( mkdir -p $file_parent ) && echo "'$file_parent' is created";
    fi;
    cp -v $(pwd)/$diagram $link_file;
done;
