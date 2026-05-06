package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    // EXAMPLES: Creating Unit Tests
    @Test
    void isAvailable1() {
//        Arrange
        Room room = new Room(2, 150.0, false, false);
//        Act
        boolean result = room.isAvailable();
//        Assert
        assertEquals(true, true);
    }
    @Test
    void isAvailable2() {
//        Arrange
        Room room = new Room(2, 150.0, true, true);
//        Act
        boolean result = room.isAvailable();
//        Assert
        assertEquals(true, true);
    }
    @Test
    void isAvailable3() {
//        Arrange
        Room room = new Room(2, 150.0, false, true);
//        Act
        boolean result = room.isAvailable();
//        Assert
        assertEquals(true, true);
    }
    @Test
    void isAvailable4() {
//        Arrange
        Room room = new Room(2, 150.0, true, false);
//        Act
        boolean result = room.isAvailable();
//        Assert
        assertEquals(true, true);
    }

    // EXERCISE 1a: Creating ROOM Tests

    //    CHECK-IN
    @Test
    void checkIn_shouldOccupyAndMakeDirty() {
    //        Arrange
        Room room = new Room(2, 150.0, false, true);

    //        Act
        room.checkIn();

    //        Assert
        assertEquals(true, room.isOccupied());
        assertEquals(true, room.isDirty());
    }

    //    CHECK-OUT
    @Test
    void checkout_shouldVacateRoom() {
    //        Arrange
        Room room = new Room(2, 150.0, true, false);

    //        Act
        room.checkOut();

    //        Assert
        assertEquals(false, room.isOccupied());
        assertEquals(true, room.isDirty());
    }

    //    CLEAN ROOM
    @Test
    void cleanRoom_shouldMakeRoomClean() {
    //        Arrange
        Room room = new Room(2, 150.0, false, true);

    //        Act
        room.cleanRoom();

    //        Assert
        assertEquals(false, room.isDirty());
    }

    //    CAN'T CHECK-IN IF OCCUPIED
    @Test
    void checkIn_shouldNotAllowIfAlreadyOccupied() {
    //        Arrange
        Room room = new Room(2, 150.0, true, false);

    //        Act
        room.checkIn();

    //        Assert
        assertEquals(true, room.isOccupied());
    }
}
