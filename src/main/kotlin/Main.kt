package org.example
//by Ala
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
}

fun ipv4Cgecker(ip:String):Boolean{
    if(!correctChars(ip) || !correctNumberOfSegments(ip) || !correctSegments(ip)){
        return false
    }
    return true
}

fun correctChars(ip:String):Boolean{
    for(char in ip){
        if(!char.isDigit() && char != '.' ){
            return false
        }
    }
    return true
}

fun correctNumberOfSegments(ip:String):Boolean{
    var counterOfDots:Int = 0
    for(char in ip){
        if(char=='.'){
            counterOfDots++
        }
    }
    if(counterOfDots != 3){
        return false
    }
    return true
}

fun correctSegments(ip:String):Boolean{
    if(ip.startsWith('.') || ip.endsWith('.')){
        return false
    }
    if(ip.length<7 || ip.length>15){
        return false
    }
    var index=0
    var segment:String=""
    while(index<ip.length){
        if(ip[index]!='.'){
            segment += ip[index].toString()
        }
        else{
            if(!checkSegment(segment)){
                return false
            }
            segment=""
        }
        index++
    }
    return true
}

fun checkSegment(segment:String):Boolean{
    if(segment.startsWith('0') && segment!="0"){
        return false
    }
    var segmentInt=segment.toIntOrNull()
    if(segmentInt==null || segmentInt<0 || segmentInt>255){
        return false
    }
    return true
}
