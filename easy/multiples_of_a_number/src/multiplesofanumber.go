package main

import (
"bufio"
"os"
"fmt"
"strconv"
"strings"

)

func main() {
	file, _ := os.Open(os.Args[1])
	scanner := bufio.NewScanner(file)
	for scanner.Scan(){
		currentLine := scanner.Text()
		splitString := strings.Split(currentLine, ",")
		currentCounter, err := strconv.Atoi(splitString[1])
		base, err := strconv.Atoi(splitString[0])
		if err != nil {
        // handle error
			fmt.Println(err)
			os.Exit(2)
		}
		for currentMultiplier := 1; currentCounter < base; currentMultiplier++ {

			currentCounter = currentCounter * currentMultiplier

		}
		
		fmt.Println(currentCounter)
	}

	if err := scanner.Err(); err != nil {
		fmt.Println(err)
	}
}