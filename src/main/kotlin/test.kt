package org.example

fun main(){
    test_ipv4CheckerCases()
}

fun test_ipv4Checker(caseNumber:Int, case: String, result: Boolean, expectedResult: Boolean){
    if(result==expectedResult){
        println("Success in case $caseNumber: $case")
    }
    else {
        println("Fail in case $caseNumber: $case. \n$result != $expectedResult")
    }
}

fun test_ipv4CheckerCases() {
    test_ipv4Checker(
        caseNumber=1,
        case= "When the string is a valid ipv4",
        result= ipv4Cgecker("192.1.2.3"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=2,
        case= "When the string is a valid ipv4 with a zero or more",
        result= ipv4Cgecker("192.0.0.3"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=3,
        case= "When the string is an ipv4 with zeros",
        result= ipv4Cgecker("0.0.0.0"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=4,
        case= "When the string is an ipv4 with 255s",
        result= ipv4Cgecker("255.255.255.255"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=5,
        case= "When the string is an ipv4 with wrong numbers in segments",
        result= ipv4Cgecker("300.285.1000.-1"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=6,
        case= "When the string is an ipv4 with wrong number of segments (less than 4)",
        result= ipv4Cgecker("192.0.3"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=7,
        case= "When the string is an ipv4 with wrong number of segments (more than 4)",
        result= ipv4Cgecker("192.0.3.1.5"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=8,
        case= "When the string is an ipv4 with one of segments missing",
        result= ipv4Cgecker("192.0..5"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=9,
        case= "When the string is an ipv4 with one of leading zeros missing",
        result= ipv4Cgecker("192.005.088.5"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=10,
        case= "When the string is not an ipv4",
        result= ipv4Cgecker("abcd!@#"),
        expectedResult= false
    )
}