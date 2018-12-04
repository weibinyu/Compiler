graph [
	node [
		id "0"
		label "Goal true"
	]
	node [
		id "27"
		label "Neg UE NOT true false"
	]
	node [
		id "26"
		label "Or BE XOR true false"
	]
	node [
		id "20"
		label "And BE AND true false"
	]
	node [
		id "11"
		label "Cmp BE > true false"
	]
	node [
		id "5"
		label "POT BE ** true false"
	]
	node [
		id "2"
		label "Constant Int 3 true false"
	]
	edge [
		id "5 to 2"
		source "5"
		target "2"
	]
	node [
		id "4"
		label "Constant Int 3 true false"
	]
	edge [
		id "5 to 4"
		source "5"
		target "4"
	]
	edge [
		id "11 to 5"
		source "11"
		target "5"
	]
	node [
		id "10"
		label "Mult BE MOD true false"
	]
	node [
		id "7"
		label "Constant Int 4 true false"
	]
	edge [
		id "10 to 7"
		source "10"
		target "7"
	]
	node [
		id "9"
		label "Constant Int 3 true false"
	]
	edge [
		id "10 to 9"
		source "10"
		target "9"
	]
	edge [
		id "11 to 10"
		source "11"
		target "10"
	]
	edge [
		id "20 to 11"
		source "20"
		target "11"
	]
	node [
		id "19"
		label "Eq BE == true false"
	]
	node [
		id "16"
		label "Add BE + true false"
	]
	node [
		id "13"
		label "Constant String B true false"
	]
	edge [
		id "16 to 13"
		source "16"
		target "13"
	]
	node [
		id "15"
		label "Constant String S true false"
	]
	edge [
		id "16 to 15"
		source "16"
		target "15"
	]
	edge [
		id "19 to 16"
		source "19"
		target "16"
	]
	node [
		id "18"
		label "Constant String BS true false"
	]
	edge [
		id "19 to 18"
		source "19"
		target "18"
	]
	edge [
		id "20 to 19"
		source "20"
		target "19"
	]
	edge [
		id "26 to 20"
		source "26"
		target "20"
	]
	node [
		id "25"
		label "Eq BE == true false"
	]
	node [
		id "22"
		label "Constant Real 1.2 true false"
	]
	edge [
		id "25 to 22"
		source "25"
		target "22"
	]
	node [
		id "24"
		label "Constant Real 1.2 true false"
	]
	edge [
		id "25 to 24"
		source "25"
		target "24"
	]
	edge [
		id "26 to 25"
		source "26"
		target "25"
	]
	edge [
		id "27 to 26"
		source "27"
		target "26"
	]
	edge [
		id "0 to 27"
		source "0"
		target "27"
	]
]
