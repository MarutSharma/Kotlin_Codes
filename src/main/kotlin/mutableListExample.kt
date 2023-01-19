fun main() {
    val entree: MutableList<String> = mutableListOf("Chole Bhature","Momos","Biriyani")
    val addmore = listOf("Pav Bhaji","Bhel Puri","Kulfi")
    println("Add Rajma Chawal:${entree.add("Rajma Chawal")}")
    println("Add List:${entree.addAll(addmore)}")
    println("Removing Rajma Chawal:${entree.remove("Rajma Chawal")}")
    println("Checking Index:${entree.get(2)}")
    println("Remove First element:${entree.removeAt(2)}")
    entree.clear()
    entree.isEmpty()
    println("Entrees:${entree.sorted()}")
}