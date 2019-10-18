 curl -k https://www.cars-data.com/en/bmw | grep "img src" > bmwpics
 cat bmwpics  | perl -n -e 'if (/title="(.*)">.*img src="(.*)" alt/) { print "curl -k -o \"$1.jpg\" $2\n";}' > bmwpics2
