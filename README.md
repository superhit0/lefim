# lefim

##Build from Source:
-1. Go to Source Directory.
-2. Install maven.
-3. mvn clean package.
-4. Get Jar from target folder


##Using jar:
-1.java -jar lefim-1.0-jar-with-dependencies.jar  -i [string-path--input-file] -o [string-path--output-file] -sup [boolean--activate-subtree-pruning] -tm [boolean--activate-transaction-merging] -c [int--maximum-transactions] -minu [minimum-utility] -minl [minimum-length] -maxl[maximum-length]
-2. Output Itemsets in output file and stats printed on console.