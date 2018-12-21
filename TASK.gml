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
		label "Push plus null"
	]
	node [
		id "6"
		label "Call null null"
	]
	node [
		id "7"
		label "Push inc null"
	]
	node [
		id "8"
		label "Call null null"
	]
	node [
		id "9"
		label "Load b Int"
	]
	node [
		id "10"
		label "Store null null"
	]
	node [
		id "11"
		label "Load a Int"
	]
	node [
		id "12"
		label "Store null null"
	]
	node [
		id "13"
		label "Store null null"
	]
	node [
		id "14"
		label "Print null Int"
	]
	node [
		id "15"
		label "Return null null"
	]
	node [
		id "16"
		label "Load x Int"
	]
	node [
		id "17"
		label "Load y Int"
	]
	node [
		id "18"
		label "BE + Int"
	]
	node [
		id "19"
		label "Store plus Int"
	]
	node [
		id "20"
		label "Return null null"
	]
	node [
		id "21"
		label "Load i Int"
	]
	node [
		id "22"
		label "1 Int"
	]
	node [
		id "23"
		label "BE + Int"
	]
	node [
		id "24"
		label "Store inc Int"
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
		id "5 CE 7"
		source "5"
		target "7"
	]
	edge [
		id "7 CE 9"
		source "7"
		target "9"
	]
	edge [
		id "9 CE 10"
		source "9"
		target "10"
	]
	edge [
		id "10 DE 9"
		source "10"
		target "9"
	]
	edge [
		id "10 CE 8"
		source "10"
		target "8"
	]
	edge [
		id "8 CE 12"
		source "8"
		target "12"
	]
	edge [
		id "12 DE 8"
		source "12"
		target "8"
	]
	edge [
		id "12 CE 11"
		source "12"
		target "11"
	]
	edge [
		id "11 CE 13"
		source "11"
		target "13"
	]
	edge [
		id "13 DE 11"
		source "13"
		target "11"
	]
	edge [
		id "13 CE 6"
		source "13"
		target "6"
	]
	edge [
		id "6 CE 14"
		source "6"
		target "14"
	]
	edge [
		id "14 DE 6"
		source "14"
		target "6"
	]
	edge [
		id "14 CE 0"
		source "14"
		target "0"
	]
	edge [
		id "16 CE 17"
		source "16"
		target "17"
	]
	edge [
		id "17 CE 18"
		source "17"
		target "18"
	]
	edge [
		id "18 DE 16"
		source "18"
		target "16"
	]
	edge [
		id "18 DE 17"
		source "18"
		target "17"
	]
	edge [
		id "18 CE 19"
		source "18"
		target "19"
	]
	edge [
		id "19 DE 18"
		source "19"
		target "18"
	]
	edge [
		id "19 CE 15"
		source "19"
		target "15"
	]
	edge [
		id "21 CE 22"
		source "21"
		target "22"
	]
	edge [
		id "22 CE 23"
		source "22"
		target "23"
	]
	edge [
		id "23 DE 21"
		source "23"
		target "21"
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
		id "24 DE 23"
		source "24"
		target "23"
	]
	edge [
		id "24 CE 20"
		source "24"
		target "20"
	]
]
