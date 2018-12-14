graph [
	node [
		id "1"
		label "Goal false false"
	]
	node [
		id "6"
		label "Global null null true true null"
	]
	node [
		id "5"
		label "Declaration INT f true true null"
	]
	edge [
		id "6 to 5"
		source "6"
		target "5"
	]
	node [
		id "4"
		label "Declaration INT e true true null"
	]
	edge [
		id "6 to 4"
		source "6"
		target "4"
	]
	node [
		id "3"
		label "Declaration INT d true true null"
	]
	edge [
		id "6 to 3"
		source "6"
		target "3"
	]
	node [
		id "2"
		label "Declaration INT c true true null"
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
		id "24"
		label "Program null function3 false false null"
	]
	node [
		id "10"
		label "Local null null true true null"
	]
	node [
		id "9"
		label "Declaration INT b true true null"
	]
	edge [
		id "10 to 9"
		source "10"
		target "9"
	]
	node [
		id "8"
		label "Declaration INT a true true null"
	]
	edge [
		id "10 to 8"
		source "10"
		target "8"
	]
	node [
		id "7"
		label "Declaration READ_WRITE outInt true true null"
	]
	edge [
		id "10 to 7"
		source "10"
		target "7"
	]
	edge [
		id "24 to 10"
		source "24"
		target "10"
	]
	node [
		id "23"
		label "Stats null null false false null"
	]
	node [
		id "13"
		label "Assign null := true true null"
	]
	node [
		id "11"
		label "Variable null a true true null"
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
		id "23 to 13"
		source "23"
		target "13"
	]
	node [
		id "16"
		label "Assign null := true true null"
	]
	node [
		id "14"
		label "Variable null b true true null"
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
		id "23 to 16"
		source "23"
		target "16"
	]
	node [
		id "22"
		label "Assign null := false false null"
	]
	node [
		id "17"
		label "Variable null outInt true true null"
	]
	edge [
		id "22 to 17"
		source "22"
		target "17"
	]
	node [
		id "21"
		label "plus FC null false false null"
	]
	node [
		id "19"
		label "inc FC null false false null"
	]
	node [
		id "18"
		label "Variable null b false false null"
	]
	edge [
		id "19 to 18"
		source "19"
		target "18"
	]
	edge [
		id "21 to 19"
		source "21"
		target "19"
	]
	node [
		id "20"
		label "Variable null a false false null"
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
		id "23 to 22"
		source "23"
		target "22"
	]
	edge [
		id "24 to 23"
		source "24"
		target "23"
	]
	edge [
		id "1 to 24"
		source "1"
		target "24"
	]
	node [
		id "35"
		label "Function INT plus true true null"
	]
	node [
		id "27"
		label "Local null null true true null"
	]
	node [
		id "26"
		label "Declaration INT y true true null"
	]
	edge [
		id "27 to 26"
		source "27"
		target "26"
	]
	node [
		id "25"
		label "Declaration INT x true true null"
	]
	edge [
		id "27 to 25"
		source "27"
		target "25"
	]
	edge [
		id "35 to 27"
		source "35"
		target "27"
	]
	node [
		id "34"
		label "Stats null null true true null"
	]
	node [
		id "33"
		label "Assign null := true true null"
	]
	node [
		id "28"
		label "Variable null plus true true null"
	]
	edge [
		id "33 to 28"
		source "33"
		target "28"
	]
	node [
		id "32"
		label "Add BE + true true false"
	]
	node [
		id "29"
		label "Variable null x true true false"
	]
	edge [
		id "32 to 29"
		source "32"
		target "29"
	]
	node [
		id "31"
		label "Variable null y true true false"
	]
	edge [
		id "32 to 31"
		source "32"
		target "31"
	]
	edge [
		id "33 to 32"
		source "33"
		target "32"
	]
	edge [
		id "34 to 33"
		source "34"
		target "33"
	]
	edge [
		id "35 to 34"
		source "35"
		target "34"
	]
	edge [
		id "1 to 35"
		source "1"
		target "35"
	]
	node [
		id "45"
		label "Function INT inc true true null"
	]
	node [
		id "37"
		label "Local null null true true null"
	]
	node [
		id "36"
		label "Declaration INT i true true null"
	]
	edge [
		id "37 to 36"
		source "37"
		target "36"
	]
	edge [
		id "45 to 37"
		source "45"
		target "37"
	]
	node [
		id "44"
		label "Stats null null true true null"
	]
	node [
		id "43"
		label "Assign null := true true null"
	]
	node [
		id "38"
		label "Variable null inc true true null"
	]
	edge [
		id "43 to 38"
		source "43"
		target "38"
	]
	node [
		id "42"
		label "Add BE + true true false"
	]
	node [
		id "39"
		label "Variable null i true true false"
	]
	edge [
		id "42 to 39"
		source "42"
		target "39"
	]
	node [
		id "41"
		label "Constant Int 1 true true false"
	]
	edge [
		id "42 to 41"
		source "42"
		target "41"
	]
	edge [
		id "43 to 42"
		source "43"
		target "42"
	]
	edge [
		id "44 to 43"
		source "44"
		target "43"
	]
	edge [
		id "45 to 44"
		source "45"
		target "44"
	]
	edge [
		id "1 to 45"
		source "1"
		target "45"
	]
]
