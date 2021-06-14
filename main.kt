fun main(args: Array<String>) {
    // 10 if statement
    println(" Question to print 10 if statement")
    val age: Int = 10
    if (age > 12) {
        println("true")
    } else {
        println("false")
    }
    if (age <= 10) {
        println("sign up")
    } else {
        println("too old")
    }
    if (age > 10) {
        println("employable")
    } else {
        println("not employable")
    }
    if (age == 10) {
        println("normal")
    } else {
        println("not normal")
    }
    if (age != 10) {
        println("Then it is either greater than or less than 10")
    } else {
        println("It is 10")
    }
    var name: String = "John"
    if (name == "John") {
        println("correct")
    } else {
        println("incorrect")
    }

    if (name != "John") {
        println("Staffs")
    } else {
        println("The manager")
    }
    if (name == "John" && age == 10) {
        println("And operator")
    } else {
        println("incorrect")
    }
    if (name == "Emeka" && age == 12) {
        println("And operator")
    } else {
        println("incorrect")
    }
    if (name == "Emeka" || age == 10) {
        println("Or operator")
    } else {
        println("incorrect")
    }
    //conditional statement
    println("Question to print when statement")
    var services: String = "First sunday"
    var servicecheck: String =
        when {
            services == "First sunday" -> "youth week"
            services == "Second sunday" -> "Women week"
            services == "Third sunday" -> "Men week"
            services == "Fourth sunday" -> "Children week"
            services == "Fifth sunday" -> "Workers week"
            else -> "not a valid service week"
        }

    println(servicecheck)

    //loop to print out 1-100
    println("Question to print from 1 - 100")
    for (o in 1..100)
        println(o)

    //loop to print 1-10 and skip 4,5
    println("Question to skip number 4 and 5")
var skip: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (num in skip) {
        if (num == 4) {
            continue
        }
        if (num == 5) {
            continue
        }

        println(num)
    }
    println("Question to print even and odd numbers")
//print even nums between 10-20 and odd nums between 20-30
    var even: Int = 10
    var odd: Int = 20
    while (even <= 20) {
        if (even % 2 == 0) {
            println(even)
        }
        even++
        if (odd % 2 == 1) {
            println(odd)
        }
        odd++
    }
    //Object for car class
    var myCar: Car = Car("",0,"","",0)
    myCar.setCarDetails("Lexus",34567,"Red","Modern", 2004)
    println("for Car properties")
    println(myCar.getCarDetails())
    //Object for House class
    var myHouse: House = House("", 0, 0.0, "", "")
    myHouse.setHouseDetails("Bonsaac",5,456.78,"blue", "Duplex")
    println("for house properties")
    println(myHouse.getHouseDetails())
    //Object for Barcelona class
    var myBarca: Barcelona = Barcelona ( "", "", 0, "", 0)
    myBarca.setBarcelonaDetails( "Catalonia", "messi", 10, "Ballon D'or", 33)
    println("for Barca properties")
    println(myBarca.getBarcelonaDetails())
    //Object for University class
    var myuni: University = University( "", "", "", "", "")
    myuni.setUniversityDetails( "uniuyo", "science", "computer science", "ibiam str uyo Akwa ibom state", "Chuks Okafor")
    println("for university properties")
    println(myuni.getUniversityDetails())
    //Object for Shop class
    var myshop: Shop = Shop( "", "", "", "", 0)
    myshop.setShopDetails ( "soap", "main market", "sky blue", "Detergent", 4)
    println("for shop properties")
    println(myshop.getShopDetails())


}
//Defining five classes with five instance variables and one constructor
// 1st class
class Car{
    var product: String = ""
    var plateNum: Int = 0
    var color: String = ""
    var type: String = ""
    var dateOfMan: Int = 0

    constructor(product: String, plateNum: Int, color: String, type: String, dateOfMan: Int){
        this.product = product
        this.plateNum = plateNum
        this.color = color
        this.type = type
        this.dateOfMan = dateOfMan
    }
    fun getCarDetails(): String{
        return "\nCar name is: ${this.product}\nplateNum is: ${this.plateNum}\nThe color is: ${this.color}" +
                "\nMotor type: ${this.type}\nyear of manufacturing: ${this.dateOfMan}"
    }
    fun setCarDetails(product: String, plateNum: Int, color: String, type: String, dateOfMan: Int){
        this.product = product
        this.plateNum = plateNum
        this.color = color
        this.type = type
        this.dateOfMan = dateOfMan
    }
}
// 2 Class
class House{
    var address: String = ""
    var rooms: Int = 0
    var size: Double = 0.0
    var color: String = ""
    var type: String = ""

    constructor(address: String, rooms:Int, size: Double, color: String, type: String){
        this.address = address
        this.rooms = rooms
        this.size = size
        this.color = color
        this.type = type
    }
    fun getHouseDetails(): String{
        return "\nHouse address: ${this.address}\nNumbers of room: ${this.rooms}" +
                "\nhouse size: ${this.size}\nhouse color: ${this.color}\ntype of building: ${this.type}"
    }
    fun setHouseDetails(address: String, rooms:Int, size: Double, color: String, type: String){
        this.address = address
        this.rooms = rooms
        this.size = size
        this.color = color
        this.type = type
    }
}
// 3rd Class
class Barcelona{
    var name: String = ""
    var playerName : String = ""
    var PlayerNum: Int = 0
    var Award: String = ""
    var Age: Int = 0

    constructor(name: String, Playername: String, PlayerNum: Int, Award: String, Age: Int){
        this.name = name
        this.playerName= Playername
        this.PlayerNum = PlayerNum
        this.Award= Award
        this.Age = Age
    }
    fun getBarcelonaDetails(): String{
        return "\nClub name: ${this.name}\nPlayers name: ${this.playerName}" +
                "\nPlayerNum: ${this.PlayerNum}\nAward: ${this.Award}\nPlayer's age: ${this.Age}"
    }
    fun setBarcelonaDetails(name: String, Playername: String, PlayerNum: Int, Award: String, Age: Int){
        this.name = name
        this.playerName= Playername
        this.PlayerNum = PlayerNum
        this.Award= Award
        this.Age = Age
    }
}
// 4th Class
class University{
    var uniName: String = ""
    var uniFaculty: String = ""
    var uniDepartment: String = ""
    var uniAddress: String = ""
    var uniVc: String = ""

    constructor(Name: String, Faculty: String, Department: String, Address: String, Vc: String){
        this.uniName = Name
        this.uniFaculty = Faculty
        this.uniDepartment = Department
        this.uniAddress = Address
        this.uniVc = Vc
    }
    fun getUniversityDetails(): String{
        return "\nUniversity name: ${this.uniName}\nfaculty: ${this.uniFaculty}" +
                "\nDepartmental name: ${this.uniDepartment}\nUniversity Location: ${this.uniAddress}" +
                "\nVice councellor: ${this.uniVc}"
    }
    fun setUniversityDetails(Name: String, Faculty: String, Department: String, Address: String, Vc: String){
        this.uniName = Name
        this.uniFaculty = Faculty
        this.uniDepartment = Department
        this.uniAddress = Address
        this.uniVc = Vc
    }
}
// 5th Class
class Foods{
    var fname: String =""
    var fnumber: Int = 0
    var fclasses: String =""
    var fweight: Double =0.0
    var fcolor: String =""

    constructor(name: String, number: Int, classes: String, weight: Double, color: String){
        this.fname = name
        this.fnumber = number
        this.fclasses = classes
        this.fweight = weight
        this.fcolor = color
    }
    fun getFoodsDetails(): String{
        return "\nFood name: ${this.fname}\nNumbers of food items: ${this.fnumber}" +
                "\nClass of Food: ${this.fclasses}\nWeight of Food: ${this.fweight}" +
                "\nFood color: ${this.fcolor}"
    }
    fun setFoodsDetails(name: String, number: Int, classes: String, weight: Double, color: String){
        this.fname = name
        this.fnumber = number
        this.fclasses = classes
        this.fweight = weight
        this.fcolor = color
    }
}
// 5th class
class Shop {
    var product: String = ""
    var location: String = ""
    var color: String = ""
    var type: String = ""
    var workers: Int = 0

    constructor(product: String, location: String, color: String, type: String, workers: Int) {
        this.product = product
        this.location = location
        this.color = color
        this.type = type
        this.workers = workers
    }

    fun getShopDetails(): String {
        return "\nproduct is: ${this.product}\nAddress: ${this.location}\nThe color of the shop is: ${this.color}" +
                "\nproduct type: ${this.type}\nnumber of workers: ${this.workers}"
    }

    fun setShopDetails(product: String, location: String, color: String, type: String, workers: Int) {
        this.product = product
        this.location = location
        this.color = color
        this.type = type
        this.workers = workers
    }
}



