graph [
	node [
		id "1"
		label "Goal true true"
	]
	node [
		id "6"
		label "Global null null true true false"
	]
	node [
		id "5"
		label "Declaration INT f true true false"
	]
	edge [
		id "6 to 5"
		source "6"
		target "5"
	]
	node [
		id "4"
		label "Declaration INT e true true false"
	]
	edge [
		id "6 to 4"
		source "6"
		target "4"
	]
	node [
		id "3"
		label "Declaration REAL d true true false"
	]
	edge [
		id "6 to 3"
		source "6"
		target "3"
	]
	node [
		id "2"
		label "Declaration REAL c true true false"
	]
	edge [
		id "6 to 2"
		source "6"
		target "2"
	]
	edge [
		id "1 to 6"
		source "1"
		target "6"
	]
	node [
		id "30"
		label "Program null function3 true true false"
	]
	node [
		id "10"
		label "Local null null true true false"
	]
	node [
		id "9"
		label "Declaration INT b true true false"
	]
	edge [
		id "10 to 9"
		source "10"
		target "9"
	]
	node [
		id "8"
		label "Declaration INT a true true false"
	]
	edge [
		id "10 to 8"
		source "10"
		target "8"
	]
	node [
		id "7"
		label "Declaration READ_WRITE outInt true true false"
	]
	edge [
		id "10 to 7"
		source "10"
		target "7"
	]
	edge [
		id "30 to 10"
		source "30"
		target "10"
	]
	node [
		id "29"
		label "Stats null null true true false"
	]
	node [
		id "13"
		label "Assign null := true true false"
	]
	node [
		id "11"
		label "Variable Int a true true false"
	]
	edge [
		id "13 to 11"
		source "13"
		target "11"
	]
	node [
		id "12"
		label "Constant Int 1 true true false"
	]
	edge [
		id "13 to 12"
		source "13"
		target "12"
	]
	edge [
		id "29 to 13"
		source "29"
		target "13"
	]
	node [
		id "16"
		label "Assign null := true true false"
	]
	node [
		id "14"
		label "Variable Int b true true false"
	]
	edge [
		id "16 to 14"
		source "16"
		target "14"
	]
	node [
		id "15"
		label "Constant Int 2 true true false"
	]
	edge [
		id "16 to 15"
		source "16"
		target "15"
	]
	edge [
		id "29 to 16"
		source "29"
		target "16"
	]
	node [
		id "22"
		label "Assign null := true true false"
	]
	node [
		id "17"
		label "Variable Real c true true false"
	]
	edge [
		id "22 to 17"
		source "22"
		target "17"
	]
	node [
		id "21"
		label "BE Add + true true false"
	]
	node [
		id "18"
		label "Constant Real 1.1 true true false"
	]
	edge [
		id "21 to 18"
		source "21"
		target "18"
	]
	node [
		id "20"
		label "Constant Int 2 true true true"
	]
	edge [
		id "21 to 20"
		source "21"
		target "20"
	]
	edge [
		id "22 to 21"
		source "22"
		target "21"
	]
	edge [
		id "29 to 22"
		source "29"
		target "22"
	]
	node [
		id "28"
		label "Assign null := true true false"
	]
	node [
		id "23"
		label "Variable Int outInt true true false"
	]
	edge [
		id "28 to 23"
		source "28"
		target "23"
	]
	node [
		id "27"
		label "FC Int plus true true false"
	]
	node [
		id "25"
		label "FC Int inc true true false"
	]
	node [
		id "24"
		label "Variable Int b true true false"
	]
	edge [
		id "25 to 24"
		source "25"
		target "24"
	]
	edge [
		id "27 to 25"
		source "27"
		target "25"
	]
	node [
		id "26"
		label "Variable Int a true true false"
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
		id "59"
		label "Function Int plus true true false"
	]
	node [
		id "33"
		label "Local null null true true false"
	]
	node [
		id "32"
		label "Declaration INT y true true false"
	]
	edge [
		id "33 to 32"
		source "33"
		target "32"
	]
	node [
		id "31"
		label "Declaration INT x true true false"
	]
	edge [
		id "33 to 31"
		source "33"
		target "31"
	]
	edge [
		id "59 to 33"
		source "59"
		target "33"
	]
	node [
		id "58"
		label "Stats null null true true false"
	]
	node [
		id "39"
		label "Assign null := true true false"
	]
	node [
		id "34"
		label "Variable Int plus true true false"
	]
	edge [
		id "39 to 34"
		source "39"
		target "34"
	]
	node [
		id "38"
		label "BE Add + true true false"
	]
	node [
		id "35"
		label "Variable Int x true true false"
	]
	edge [
		id "38 to 35"
		source "38"
		target "35"
	]
	node [
		id "37"
		label "Variable Int y true true false"
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
		id "58 to 39"
		source "58"
		target "39"
	]
	node [
		id "57"
		label "IF null null true true false"
	]
	node [
		id "43"
		label "BE Cmp > true true false"
	]
	node [
		id "40"
		label "Variable Int x true true false"
	]
	edge [
		id "43 to 40"
		source "43"
		target "40"
	]
	node [
		id "42"
		label "Constant Int 1 true true false"
	]
	edge [
		id "43 to 42"
		source "43"
		target "42"
	]
	edge [
		id "57 to 43"
		source "57"
		target "43"
	]
	node [
		id "50"
		label "Stats null null true true false"
	]
	node [
		id "49"
		label "Assign null := true true false"
	]
	node [
		id "44"
		label "Variable Int plus true true false"
	]
	edge [
		id "49 to 44"
		source "49"
		target "44"
	]
	node [
		id "48"
		label "BE Mult MOD true true false"
	]
	node [
		id "45"
		label "Variable Int x true true false"
	]
	edge [
		id "48 to 45"
		source "48"
		target "45"
	]
	node [
		id "47"
		label "Variable Int y true true false"
	]
	edge [
		id "48 to 47"
		source "48"
		target "47"
	]
	edge [
		id "49 to 48"
		source "49"
		target "48"
	]
	edge [
		id "50 to 49"
		source "50"
		target "49"
	]
	edge [
		id "57 to 50"
		source "57"
		target "50"
	]
	node [
		id "56"
		label "Stats null null true true false"
	]
	node [
		id "55"
		label "Assign null := true true false"
	]
	node [
		id "51"
		label "Variable Int x true true false"
	]
	edge [
		id "55 to 51"
		source "55"
		target "51"
	]
	node [
		id "54"
		label "UE Add - true true false"
	]
	node [
		id "53"
		label "Constant Int 1 true true false"
	]
	edge [
		id "54 to 53"
		source "54"
		target "53"
	]
	edge [
		id "55 to 54"
		source "55"
		target "54"
	]
	edge [
		id "56 to 55"
		source "56"
		target "55"
	]
	edge [
		id "57 to 56"
		source "57"
		target "56"
	]
	edge [
		id "58 to 57"
		source "58"
		target "57"
	]
	edge [
		id "59 to 58"
		source "59"
		target "58"
	]
	edge [
		id "1 to 59"
		source "1"
		target "59"
	]
	node [
		id "78"
		label "Function Int inc true true false"
	]
	node [
		id "61"
		label "Local null null true true false"
	]
	node [
		id "60"
		label "Declaration INT i true true false"
	]
	edge [
		id "61 to 60"
		source "61"
		target "60"
	]
	edge [
		id "78 to 61"
		source "78"
		target "61"
	]
	node [
		id "77"
		label "Stats null null true true false"
	]
	node [
		id "67"
		label "Assign null := true true false"
	]
	node [
		id "62"
		label "Variable Int inc true true false"
	]
	edge [
		id "67 to 62"
		source "67"
		target "62"
	]
	node [
		id "66"
		label "BE Add + true true false"
	]
	node [
		id "63"
		label "Variable Int i true true false"
	]
	edge [
		id "66 to 63"
		source "66"
		target "63"
	]
	node [
		id "65"
		label "Constant Int 1 true true false"
	]
	edge [
		id "66 to 65"
		source "66"
		target "65"
	]
	edge [
		id "67 to 66"
		source "67"
		target "66"
	]
	edge [
		id "77 to 67"
		source "77"
		target "67"
	]
	node [
		id "76"
		label "While null null true true false"
	]
	node [
		id "71"
		label "BE Cmp > true true false"
	]
	node [
		id "68"
		label "Variable Int inc true true false"
	]
	edge [
		id "71 to 68"
		source "71"
		target "68"
	]
	node [
		id "70"
		label "Constant Int 1 true true false"
	]
	edge [
		id "71 to 70"
		source "71"
		target "70"
	]
	edge [
		id "76 to 71"
		source "76"
		target "71"
	]
	node [
		id "75"
		label "Stats null null true true false"
	]
	node [
		id "74"
		label "Assign null := true true false"
	]
	node [
		id "72"
		label "Variable Int inc true true false"
	]
	edge [
		id "74 to 72"
		source "74"
		target "72"
	]
	node [
		id "73"
		label "Constant Int 0 true true false"
	]
	edge [
		id "74 to 73"
		source "74"
		target "73"
	]
	edge [
		id "75 to 74"
		source "75"
		target "74"
	]
	edge [
		id "76 to 75"
		source "76"
		target "75"
	]
	edge [
		id "77 to 76"
		source "77"
		target "76"
	]
	edge [
		id "78 to 77"
		source "78"
		target "77"
	]
	edge [
		id "1 to 78"
		source "1"
		target "78"
	]
]
