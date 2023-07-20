// Imports
import kotlin.math.abs

// Constants
const val STARTING_ROOM = "Bedroom"
const val ROOM_SIZE_LIMIT = 500

// Global variables
var roomsCleaned = 0
var roomSize = 0

// Objects
data class Room(val name: String, val size: Int)

// Enums
enum class CleaningResult { SUCCESS, FAILURE }

// Functions
fun cleanRoom(room: Room): CleaningResult {
    val cleaningTime = abs(room.size)
    println("Cleaning the $room room: This will take approximately $cleaningTime minutes")
    if (room.size > ROOM_SIZE_LIMIT) {
        println("The room is too big to clean")
        return CleaningResult.FAILURE
    } else { 
        Thread.sleep(cleaningTime.toLong())
        println("Room successfully cleaned!")
        roomsCleaned += 1
        return CleaningResult.SUCCESS
    }
}

// Main function
fun main(args: Array<String>) {
    println("Starting the 'Clean Sweep' program!")
    roomSize = 50
    val startingRoom = Room(STARTING_ROOM, roomSize)
    println("Let's start with cleaning the $STARTING_ROOM room")
    val result = cleanRoom(startingRoom)
    if (result == CleaningResult.SUCCESS) {
        println("Rooms cleaned: $roomsCleaned")
    } else {
        println("Unable to clean the room. Try again!")
    }
}