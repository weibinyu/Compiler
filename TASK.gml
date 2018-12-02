graph [
	node [
		id "Start"
		label "Start"
	]
	node [
		id "19"
		label "123456(Int false)"
	]
	node [
		id "26"
		label "*(Real false)"
	]
	node [
		id "18"
		label "Terminate(Void false)"
	]
	edge [
		id "Start CE Const"
		source "Start"
		target "19"
	]
	edge [
		id "BE CE Terminate"
		source "26"
		target "18"
	]
	node [
		id "24"
		label "-(Int true)"
	]
	node [
		id "25"
		label "123.(Real false)"
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
	node [
		id "23"
		label "-(Int false)"
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
	node [
		id "21"
		label "+(Int false)"
	]
	node [
		id "22"
		label "9(Int false)"
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
	node [
		id "20"
		label "23(Int false)"
	]
	edge [
		id "19 CE 20"
		source "19"
		target "20"
	]
	edge [
		id "20 CE 21"
		source "20"
		target "21"
	]
	edge [
		id "21 DE 19"
		source "21"
		target "19"
	]
	edge [
		id "21 DE 20"
		source "21"
		target "20"
	]
]
