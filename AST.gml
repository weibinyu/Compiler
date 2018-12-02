graph [
	node [
		id "0"
		label "Goal true"
	]
	node [
		id "12"
		label "Mult BE * true false"
	]
	node [
		id "9"
		label "Add UE - true true"
	]
	node [
		id "8"
		label "Add BE - true false"
	]
	node [
		id "5"
		label "Add BE + true false"
	]
	node [
		id "2"
		label "Constant Int 123456 true false"
	]
	edge [
		id "5 to 2"
		source "5"
		target "2"
	]
	node [
		id "4"
		label "Constant Int 23 true false"
	]
	edge [
		id "5 to 4"
		source "5"
		target "4"
	]
	edge [
		id "8 to 5"
		source "8"
		target "5"
	]
	node [
		id "7"
		label "Constant Int 9 true false"
	]
	edge [
		id "8 to 7"
		source "8"
		target "7"
	]
	edge [
		id "9 to 8"
		source "9"
		target "8"
	]
	edge [
		id "12 to 9"
		source "12"
		target "9"
	]
	node [
		id "11"
		label "Constant Real 123. true false"
	]
	edge [
		id "12 to 11"
		source "12"
		target "11"
	]
	edge [
		id "0 to 12"
		source "0"
		target "12"
	]
]
