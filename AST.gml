graph [
	node [
		id "1"
		label "Goal true true"
	]
	node [
		id "19"
		label "Program null function3 true true false"
	]
	node [
		id "5"
		label "Local null null true true false"
	]
	node [
		id "4"
		label "Declaration INT b true true false"
	]
	edge [
		id "5 to 4"
		source "5"
		target "4"
	]
	node [
		id "3"
		label "Declaration INT a true true false"
	]
	edge [
		id "5 to 3"
		source "5"
		target "3"
	]
	node [
		id "2"
		label "Declaration READ_WRITE outInt true true false"
	]
	edge [
		id "5 to 2"
		source "5"
		target "2"
	]
	edge [
		id "19 to 5"
		source "19"
		target "5"
	]
	node [
		id "18"
		label "Stats null null true true false"
	]
	node [
		id "8"
		label "Assign null := true true false"
	]
	node [
		id "6"
		label "Variable Int a true true false"
	]
	edge [
		id "8 to 6"
		source "8"
		target "6"
	]
	node [
		id "7"
		label "Constant Int 1 true true false"
	]
	edge [
		id "8 to 7"
		source "8"
		target "7"
	]
	edge [
		id "18 to 8"
		source "18"
		target "8"
	]
	node [
		id "11"
		label "Assign null := true true false"
	]
	node [
		id "9"
		label "Variable Int b true true false"
	]
	edge [
		id "11 to 9"
		source "11"
		target "9"
	]
	node [
		id "10"
		label "Constant Int 2 true true false"
	]
	edge [
		id "11 to 10"
		source "11"
		target "10"
	]
	edge [
		id "18 to 11"
		source "18"
		target "11"
	]
	node [
		id "17"
		label "Assign null := true true false"
	]
	node [
		id "12"
		label "Variable Int outInt true true false"
	]
	edge [
		id "17 to 12"
		source "17"
		target "12"
	]
	node [
		id "16"
		label "FC Int plus true true false"
	]
	node [
		id "14"
		label "FC Int inc true true false"
	]
	node [
		id "13"
		label "Variable Int b true true false"
	]
	edge [
		id "14 to 13"
		source "14"
		target "13"
	]
	edge [
		id "16 to 14"
		source "16"
		target "14"
	]
	node [
		id "15"
		label "Variable Int a true true false"
	]
	edge [
		id "16 to 15"
		source "16"
		target "15"
	]
	edge [
		id "17 to 16"
		source "17"
		target "16"
	]
	edge [
		id "18 to 17"
		source "18"
		target "17"
	]
	edge [
		id "19 to 18"
		source "19"
		target "18"
	]
	edge [
		id "1 to 19"
		source "1"
		target "19"
	]
	node [
		id "30"
		label "Function Int plus true true false"
	]
	node [
		id "22"
		label "Local null null true true false"
	]
	node [
		id "21"
		label "Declaration INT y true true false"
	]
	edge [
		id "22 to 21"
		source "22"
		target "21"
	]
	node [
		id "20"
		label "Declaration INT x true true false"
	]
	edge [
		id "22 to 20"
		source "22"
		target "20"
	]
	edge [
		id "30 to 22"
		source "30"
		target "22"
	]
	node [
		id "29"
		label "Stats null null true true false"
	]
	node [
		id "28"
		label "Assign null := true true false"
	]
	node [
		id "23"
		label "Variable Int plus true true false"
	]
	edge [
		id "28 to 23"
		source "28"
		target "23"
	]
	node [
		id "27"
		label "BE Add + true true false"
	]
	node [
		id "24"
		label "Variable Int x true true false"
	]
	edge [
		id "27 to 24"
		source "27"
		target "24"
	]
	node [
		id "26"
		label "Variable Int y true true false"
	]
	edge [
		id "27 to 26"
		source "27"
		target "26"
	]
	edge [
		id "28 to 27"
		source "28"
		target "27"
	]
	edge [
		id "29 to 28"
		source "29"
		target "28"
	]
	edge [
		id "30 to 29"
		source "30"
		target "29"
	]
	edge [
		id "1 to 30"
		source "1"
		target "30"
	]
	node [
		id "40"
		label "Function Int inc true true false"
	]
	node [
		id "32"
		label "Local null null true true false"
	]
	node [
		id "31"
		label "Declaration INT i true true false"
	]
	edge [
		id "32 to 31"
		source "32"
		target "31"
	]
	edge [
		id "40 to 32"
		source "40"
		target "32"
	]
	node [
		id "39"
		label "Stats null null true true false"
	]
	node [
		id "38"
		label "Assign null := true true false"
	]
	node [
		id "33"
		label "Variable Int inc true true false"
	]
	edge [
		id "38 to 33"
		source "38"
		target "33"
	]
	node [
		id "37"
		label "BE Add + true true false"
	]
	node [
		id "34"
		label "Variable Int i true true false"
	]
	edge [
		id "37 to 34"
		source "37"
		target "34"
	]
	node [
		id "36"
		label "Constant Int 1 true true false"
	]
	edge [
		id "37 to 36"
		source "37"
		target "36"
	]
	edge [
		id "38 to 37"
		source "38"
		target "37"
	]
	edge [
		id "39 to 38"
		source "39"
		target "38"
	]
	edge [
		id "40 to 39"
		source "40"
		target "39"
	]
	edge [
		id "1 to 40"
		source "1"
		target "40"
	]
]
