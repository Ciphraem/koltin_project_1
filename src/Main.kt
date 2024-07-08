//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*val name = "Kotlin";
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!");

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    };*/

    //the above is sample code that came with the project

    println("Some examples of println() function.");
    println("Hello World");
    println("I am learning Kotlin.");
    println("It is awesome!");
    println(3+4);

    print("Some examples of print() function. ");
    print("Hello World! ");
    print("I am learning Kotlin. ");
    println("It is awesome!");

    var name = "Sam Pole"; //rewritable if declared data type; string (text)
    // var name: String = "Sam Pole";
    val birthyear = 1975; //constant; int (number)
    // val birthyear: Int = 1975;

    println("Hello, my name is " + name + "."); //print text and the value of name
    println("$name was born on $birthyear."); //print the value of birthyear

    var x = 5;
    var y = 6;
    println(x + y);

    /*
    data types: Number, Characters, Booleans, Strings, Arrays
    Number:
        Integer (whole number):
            Byte (-128 to 127)
            Short (-32768 to 32767)
            Int (-2147483648 to 2147483647)
            Long (-9223372036854775807 to 9223372036854775807)
        Floating (decimals):
            Float (6 to 7 decimal places)
            Double (up to 15 decimal places)
     */
}