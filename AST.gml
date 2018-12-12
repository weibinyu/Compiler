graph [
	node [
		id "0"
		label "Goal null"
	]
	node [
		id "7"
		label "Add BE + null null"
	]
	node [
		id "4"
		label "Constant BE 2 null null"
	]
	node [
		id "1"
		label "Constant Int 1 true null"
	]
	edge [
		id "4 to 1"
		source "4"
		target "1"
	]
	node [
		id "3"
		label "Add Numeric + null null"
	]
	edge [
		id "4 to 3"
		source "4"
		target "3"
	]
	edge [
		id "7 to 4"
		source "7"
		target "4"
	]
	node [
		id "6"
		label "Constant Int 1 true null"
	]
	edge [
		id "7 to 6"
		source "7"
		target "6"
	]
	edge [
		id "0 to 7"
		source "0"
		target "7"
	]
]
