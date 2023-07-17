Public Class CleanSweep

    Dim length As Integer
    Dim width As Integer
    Dim area As Integer

    'Calculate the area of the room
    Sub CalculateArea()
        area = length * width
    End Sub

    'Calculate the cost of the Cleaning
    Function CalculateCost() As Double
        Dim cost As Double
        cost = area * 0.15
        Return cost
    End Function

    'Clean the room
    Sub CleanRoom()
        MsgBox("Room Cleaning In Progress")
    End Sub

    'Gather Tools
    Sub GatherTools()
        MsgBox("Gathering Cleaning Tools")
    End Sub

    'Move Furniture
    Sub MoveFurniture()
        MsgBox("Moving Furniture to Clean Room")
    End Sub

    'Sweep the Room
    Sub SweepRoom()
        MsgBox("Sweeping the Room")
    End Sub

    'Mop the Floor
    Sub MopFloor()
        MsgBox("Mopping the Floor")
    End Sub

    'Dust the Room
    Sub DustRoom()
        MsgBox("Dusting the Room")
    End Sub

    'Vacuum the Room
    Sub VacuumRoom()
        MsgBox("Vacuuming the Room")
    End Sub

    'Wipe Down Surfaces
    Sub WipeDown()
        MsgBox("Wiping down all surfaces")
    End Sub

    'Empty Garbage
    Sub EmptyGarbage()
        MsgBox("Emptying garbage cans")
    End Sub

    'Clean Windows
    Sub CleanWindows()
        MsgBox("Cleaning windows")
    End Sub

    'Gather Dirty Linens
    Sub GatherLinens()
        MsgBox("Gathering all dirty linens")
    End Sub

    'Put Back Furniture
    Sub PutBackFurniture()
        MsgBox("Putting furniture back in place")
    End Sub

    'Cleanup
    Sub Cleanup()
        MsgBox("Cleaning up messes")
    End Sub

    'Open Windows
    Sub OpenWindows()
        MsgBox("Opening windows to air out room")
    End Sub

    'Finish
    Sub Finished()
        MsgBox("Cleaning of the room complete")
    End Sub

End Class