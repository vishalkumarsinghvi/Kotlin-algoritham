import kotlin.collections.maxBy

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
  //find the maximum occurring char in string
  val stringName = ""
  if(stringName.isNotEmpty()){
  val char = findMaxOccurringChar(stringName)
  println("Maximum occurring char is $char")
  }else{ 
  println("your string is empty please change your input")
   }
}

fun findMaxOccurringChar(value: String) : Char{
    val hashMap : HashMap<Char, Int> = HashMap<Char, Int>()
    val charArray = value.toCharArray()
    for(item in charArray){
        if(hashMap.contains(item)){
        val count = hashMap.get(item) ?: 0
        hashMap.put(item , count.plus(1) )
        }else{
            hashMap.put(item,1)
        }
    }
    
    var tempChar : Char = 'a'
    var tempValue = 0
    hashMap.forEach { (k, v) ->
        
        if(v > tempValue){
            tempValue = v
            tempChar = k.toChar()
        }
    }
 
    return tempChar
    
}
