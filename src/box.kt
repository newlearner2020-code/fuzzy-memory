class box {
    val length:Int=10
    val width:Int=25
    fun openbox()
    {
        println("the box is opened")

    }
    val volume
       get() = length*width
    var boxname:String="Box Name"
        //the default value is box Name
        //but we also set the value in main fuction using setter method
        // if main fuction is nul then default value will print
    set(value)
    {
        if(value.length<3)
        {
            println("Name cannot be less then 3")
        }
        else
        {
            field=value
        }
    }
}