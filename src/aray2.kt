fun main() {
    var array1 = Array<Int>(3) { 5 }
   var array2= arrayOf("alfa","beta","gama","delta")
    var array3= arrayOf(5,10,15,20,25,30,"alfa2","beta2","delta2")
    var array4= arrayOf<Int>(1,2,13,4,5,6,7,8,9)
    var array5:IntArray= intArrayOf(10,20,13,40,50,60)
    for (a in array1) {

        print("$a \t")
        print("\t")


    }
    for (a in array2) {

        print("$a \t")
        print("\t")


    }
    for (a in array3) {

        print("$a \t")
        print("\t")


    }
    for (a in array4) {

        print("$a \t")
        print("\t")


    }
    for (a in array5) {

        print("$a \t")
        print("\t")


    }

}