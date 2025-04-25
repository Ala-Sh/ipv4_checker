package org.example

fun main(){
    test_ipv4CheckerCases()
    //empty
    //starts or ends with .
    //starts or ends with a space
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
        case= "When the string is a valid ipv4 return true",
        result= ipv4Cgecker("192.1.2.3"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=2,
        case= "When the string is a valid ipv4 with a zero or more return true",
        result= ipv4Cgecker("192.0.0.3"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=3,
        case= "When the string is an ipv4 with zeros return true",
        result= ipv4Cgecker("0.0.0.0"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=4,
        case= "When the string is an ipv4 with 255s return true",
        result= ipv4Cgecker("255.255.255.255"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=5,
        case= "When the string is an ipv4 with wrong numbers in segments return true(<0) return false",
        result= ipv4Cgecker("300.285.100.-1"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=6,
        case= "When the string is an ipv4 with wrong numbers in segments return true(>255) return false",
        result= ipv4Cgecker("300.285.1000.1"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=7,
        case= "When the string is an ipv4 with wrong number of segments (less than 4) return false",
        result= ipv4Cgecker("192.0.3"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=8,
        case= "When the string is an ipv4 with wrong number of segments (more than 4) return false",
        result= ipv4Cgecker("192.0.3.1.5"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=9,
        case= "When the string is an ipv4 with one of segments missing return false",
        result= ipv4Cgecker("192.0..5"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=10,
        case= "When the string is an ipv4 with leading zeros return false",
        result= ipv4Cgecker("192.005.088.5"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=11,
        case= "When the string is an ipv4 with leading zeros for 0 return false",
        result= ipv4Cgecker("000.000.000.00"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=12,
        case= "When the string is not an ipv4 return false",
        result= ipv4Cgecker("abcd!@#"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=13,
        case= "When the string contains a wrong segment return false",
        result= ipv4Cgecker("192.ab2.088.5"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=14,
        case= "When the string starts with . return false",
        result= ipv4Cgecker(".192.1.2"),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=15,
        case= "When the string ends with . return false",
        result= ipv4Cgecker("192.1.2."),
        expectedResult= false
    )
    test_ipv4Checker(
        caseNumber=16,
        case= "When the string is a valid ipv4 but starts with one space return true",
        result= ipv4Cgecker(" 192.1.2.3"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=17,
        case= "When the string is a valid ipv4 but starts with more than one space return true",
        result= ipv4Cgecker("  192.1.2.3"),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=18,
        case= "When the string is a valid ipv4 but ends with one space return true",
        result= ipv4Cgecker("192.1.2.3 "),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=19,
        case= "When the string is a valid ipv4 but ends with more than one space return true",
        result= ipv4Cgecker("192.1.2.3    "),
        expectedResult= true
    )
    test_ipv4Checker(
        caseNumber=20,
        case= "When the string isempty return false",
        result= ipv4Cgecker(""),
        expectedResult= false
    )
    //add test case for wrong segments
}