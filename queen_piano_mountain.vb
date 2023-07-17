all the Computers on the Desktop

' This VB module demonstrates how to "Clean Sweep" all the computers on the desktop 

Private Sub CleanSweepComps()

Dim comps As Collection
Dim comp As Component

' Create a collection to store all the computers
Set comps = New Collection

'Loop through all the objects on the desktop
For Each comp In ActiveDocument.Components

'Check to see if the object is a computer
If InStr(1, comp.Name, "Computer") Then

'If it is a computer, store it in the collection
comps.Add comp

End If

Next comp

'Now loop through the computers and clean sweep each one
For Each comp In comps

'Clean sweep the computer
comp.RunMethod "CleanSweep"

'Reset the computer to restart clean sweep
comp.RunMethod "Reset"

Next comp

End Sub