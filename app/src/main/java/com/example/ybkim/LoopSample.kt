package com.example.ybkim

fun main(args:Array<String>) {
    // MutalList 테스트
    // 사이즈를 정하지 않고 선언한다.
    var mulList: MutableList<String> = mutableListOf<String>()

    // 한개를 넣어본다.
    mulList.add(0,"첫번째 value")

    // 여러개를 넣을수도 있다.
    mulList.addAll( listOf("두번째", "세번째", "네번째"))

    // 한개를 출력해본다.
    println ("==========================================================")
    println ("------------------ mutable list test ---------------------")
    println ( "mulList.get(0): ${mulList.get(0)}" )
    println ( "mulList.get(1): ${mulList.get(1)}" )
    println ( "mulList.size  : ${mulList.size}" ) //  사이즈

    mulList.addAll( listOf("5", "6", "7"))
    println ( "mulList.size  : ${mulList.size}" ) //  사이즈

    println ("---------------------------------------------------------")

    // loop 돌면서 출력해본다.
    for ( i in 0 .. mulList.size-1) {
        println ("mulList loop: $i ${mulList.get(i)} ")
    }
    println ("---------------------------------------------------------")
    for ( e in  mulList) {
        println ("mulList loop: $e ")
    }

    println ("---------------------------------------------------------")
    // 초기화
    mulList.clear()
    println ( "초기화후 mulList.size  : ${mulList.size}" ) //  사이즈

    println ("==========================================================")
    println ("------------------  함수 선언 하기     ---------------------")
    //
    fun fn_sum ( v_i: Int, v_i2 :Int ):Int {
        return v_i + v_i2
    }

    // for loop
    println ("==========================================================")
    println ("------------------ for loop 1    ---------------------")
    var items = listOf("apple", "banana", "kiwi")
    for ( item in items ) {
        println ( item )
    }

    println ("------------------ for loop 2    ---------------------")
    for ( index in items.indices ) {
        println ( items[index])
    }

    println ("------------------ for loop 3    ---------------------")

    // i++ 필요 없다.
    for ( i in 0 .. items.size-1 ) {
        println ( items[i])
    }

    println ("------------------ for loop 4    ---------------------")
    // 아래처럼 while  에서는 i 를 바로 쓰지 못한다.
    /*
    while ( i in 0 .. items.size ) {
        println ( items[i])
    }
    */

    println ("------------------ for loop 5    ---------------------")
    // 이렇게 while 은 미리 선언해야 한다.
    var i : Int = 0
    while ( i <  items.size ) {
        println ( items[i])
        i++
    }

    println ("==========================================================")
    println ("------------------ when expression 1  ---------------------")
    var x : Int = 1
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }

    println ("------------------ when expression 2  ( or  ) ---------------------")
    var x2 : Int = 2
    when (x2) {
        1,3  -> println("x == 1,3") /* or 절 */
        4 -> println("x == 4")
        else -> { // Note the block
            println("x is neither 1 , 3 nor 4 ")
        }
    }

    println ("------------------ when expression 2  ( range  and not ) ---------------------")
    var x3 : Int = 30
    when (x3) {
        in 1..10 -> println("x is in the range")
        in  11..15 -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    println ("==========================================================")
    println ("------------------ nullable test     ---------------------")

    // 아래처럼 null 이 입력될수 있는 값은 String? 로 변수를 넘겨야 한다.
    fun describeString(maybeString: String?): String {              // 1
        if (maybeString != null && maybeString.length > 0) {        // 2
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"                           // 3
        }
    }

    println ( describeString(null))

//    var neverNull: String = "This can't be null"            // 1
//    neverNull = null                                        // 2
//
//    var nullable: String? = "You can keep a null here"      // 3
//
//    nullable = null                                         // 4
//
//    var inferredNonNull = "The compiler assumes non-null"   // 5
//    inferredNonNull = null                                  // 6
//
//    fun strLength(notNull: String): Int {                   // 7
//        return notNull.length
//    }
//    strLength(neverNull)                                    // 8
//    strLength(nullable)                                     // 9

}


