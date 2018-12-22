graph [
	node [
		id "0"
		label "Terminate null"
	]
	node [
		id "1"
		label "1 Int"
	]
	node [
		id "2"
		label "Store a Int"
	]
	node [
		id "3"
		label "2 Int"
	]
	node [
		id "4"
		label "Store b Int"
	]
	node [
		id "5"
		label "1.1 Real"
	]
	node [
		id "6"
		label "2 Int"
	]
	node [
		id "7"
		label "BE + Real"
	]
	node [
		id "8"
		label "Store c Real"
	]
	node [
		id "9"
		label "Push plus null"
	]
	node [
		id "10"
		label "Call null null"
	]
	node [
		id "11"
		label "Push inc null"
	]
	node [
		id "12"
		label "Call null null"
	]
	node [
		id "13"
		label "Load b Int"
	]
	node [
		id "14"
		label "Store i null"
	]
	node [
		id "15"
		label "Load a Int"
	]
	node [
		id "16"
		label "Store x null"
	]
	node [
		id "17"
		label "Store y null"
	]
	node [
		id "18"
		label "Print null Int"
	]
	node [
		id "19"
		label "Return null null"
	]
	node [
		id "20"
		label "Load x Int"
	]
	node [
		id "21"
		label "Load y Int"
	]
	node [
		id "22"
		label "BE + Int"
	]
	node [
		id "23"
		label "Store plus Int"
	]
	node [
		id "24"
		label "Load x Int"
	]
	node [
		id "25"
		label "1 Int"
	]
	node [
		id "26"
		label "BE > Bool"
	]
	node [
		id "27"
		label "Load x Int"
	]
	node [
		id "28"
		label "Load y Int"
	]
	node [
		id "29"
		label "BE MOD Int"
	]
	node [
		id "30"
		label "Store plus Int"
	]
	node [
		id "31"
		label "1 Int"
	]
	node [
		id "32"
		label "UE - Int"
	]
	node [
		id "33"
		label "Store x Int"
	]
	node [
		id "34"
		label "IF null null"
	]
	node [
		id "35"
		label "Return null null"
	]
	node [
		id "36"
		label "Load i Int"
	]
	node [
		id "37"
		label "1 Int"
	]
	node [
		id "38"
		label "BE + Int"
	]
	node [
		id "39"
		label "Store inc Int"
	]
	node [
		id "40"
		label "Load inc Int"
	]
	node [
		id "41"
		label "1 Int"
	]
	node [
		id "42"
		label "BE > Bool"
	]
	node [
		id "43"
		label "0 Int"
	]
	node [
		id "44"
		label "Store inc Int"
	]
	node [
		id "45"
		label "IF null null"
	]
	node [
		id "46"
		label "Store i null"
	]
	node [
		id "47"
		label "Store x null"
	]
	node [
		id "48"
		label "Store y null"
	]
	node [
		id "Start"
		label "Start"
	]
	edge [
		id "Start CE Const"
		source "Start"
		target "1"
	]
	edge [
		id "1 CE 2"
		source "1"
		target "2"
	]
	edge [
		id "2 DE 1"
		source "2"
		target "1"
	]
	edge [
		id "2 CE 3"
		source "2"
		target "3"
	]
	edge [
		id "3 CE 4"
		source "3"
		target "4"
	]
	edge [
		id "4 DE 3"
		source "4"
		target "3"
	]
	edge [
		id "4 CE 5"
		source "4"
		target "5"
	]
	edge [
		id "5 CE 6"
		source "5"
		target "6"
	]
	edge [
		id "6 CE 7"
		source "6"
		target "7"
	]
	edge [
		id "7 DE 5"
		source "7"
		target "5"
	]
	edge [
		id "7 DE 6"
		source "7"
		target "6"
	]
	edge [
		id "7 CE 8"
		source "7"
		target "8"
	]
	edge [
		id "8 DE 7"
		source "8"
		target "7"
	]
	edge [
		id "8 CE 9"
		source "8"
		target "9"
	]
	edge [
		id "9 CE 11"
		source "9"
		target "11"
	]
	edge [
		id "11 CE 13"
		source "11"
		target "13"
	]
	edge [
		id "13 CE 46"
		source "13"
		target "46"
	]
	edge [
		id "46 DE 13"
		source "46"
		target "13"
	]
	edge [
		id "46 CE 12"
		source "46"
		target "12"
	]
	edge [
		id "12 CE 47"
		source "12"
		target "47"
	]
	edge [
		id "47 DE 12"
		source "47"
		target "12"
	]
	edge [
		id "47 CE 15"
		source "47"
		target "15"
	]
	edge [
		id "15 CE 48"
		source "15"
		target "48"
	]
	edge [
		id "48 DE 15"
		source "48"
		target "15"
	]
	edge [
		id "48 CE 10"
		source "48"
		target "10"
	]
	edge [
		id "10 CE 18"
		source "10"
		target "18"
	]
	edge [
		id "18 DE 10"
		source "18"
		target "10"
	]
	edge [
		id "18 CE 0"
		source "18"
		target "0"
	]
	edge [
		id "20 CE 21"
		source "20"
		target "21"
	]
	edge [
		id "21 CE 22"
		source "21"
		target "22"
	]
	edge [
		id "22 DE 20"
		source "22"
		target "20"
	]
	edge [
		id "22 DE 21"
		source "22"
		target "21"
	]
	edge [
		id "22 CE 23"
		source "22"
		target "23"
	]
	edge [
		id "23 DE 22"
		source "23"
		target "22"
	]
	edge [
		id "23 CE 24"
		source "23"
		target "24"
	]
	edge [
		id "24 CE 25"
		source "24"
		target "25"
	]
	edge [
		id "25 CE 26"
		source "25"
		target "26"
	]
	edge [
		id "26 DE 24"
		source "26"
		target "24"
	]
	edge [
		id "26 DE 25"
		source "26"
		target "25"
	]
	edge [
		id "27 CE 28"
		source "27"
		target "28"
	]
	edge [
		id "28 CE 29"
		source "28"
		target "29"
	]
	edge [
		id "29 DE 27"
		source "29"
		target "27"
	]
	edge [
		id "29 DE 28"
		source "29"
		target "28"
	]
	edge [
		id "29 CE 30"
		source "29"
		target "30"
	]
	edge [
		id "30 DE 29"
		source "30"
		target "29"
	]
	edge [
		id "30 CE 19"
		source "30"
		target "19"
	]
	edge [
		id "31 CE 32"
		source "31"
		target "32"
	]
	edge [
		id "32 DE 31"
		source "32"
		target "31"
	]
	edge [
		id "32 CE 33"
		source "32"
		target "33"
	]
	edge [
		id "33 DE 32"
		source "33"
		target "32"
	]
	edge [
		id "33 CE 19"
		source "33"
		target "19"
	]
	edge [
		id "26 CE 34"
		source "26"
		target "34"
	]
	edge [
		id "34 CE 27"
		source "34"
		target "27"
	]
	edge [
		id "34 CE 31"
		source "34"
		target "31"
	]
	edge [
		id "36 CE 37"
		source "36"
		target "37"
	]
	edge [
		id "37 CE 38"
		source "37"
		target "38"
	]
	edge [
		id "38 DE 36"
		source "38"
		target "36"
	]
	edge [
		id "38 DE 37"
		source "38"
		target "37"
	]
	edge [
		id "38 CE 39"
		source "38"
		target "39"
	]
	edge [
		id "39 DE 38"
		source "39"
		target "38"
	]
	edge [
		id "39 CE 40"
		source "39"
		target "40"
	]
	edge [
		id "40 CE 41"
		source "40"
		target "41"
	]
	edge [
		id "41 CE 42"
		source "41"
		target "42"
	]
	edge [
		id "42 DE 40"
		source "42"
		target "40"
	]
	edge [
		id "42 DE 41"
		source "42"
		target "41"
	]
	edge [
		id "43 CE 44"
		source "43"
		target "44"
	]
	edge [
		id "44 DE 43"
		source "44"
		target "43"
	]
	edge [
		id "44 CE 40"
		source "44"
		target "40"
	]
	edge [
		id "42 CE 45"
		source "42"
		target "45"
	]
	edge [
		id "45 CE 43"
		source "45"
		target "43"
	]
	edge [
		id "45 CE 35"
		source "45"
		target "35"
	]
]
