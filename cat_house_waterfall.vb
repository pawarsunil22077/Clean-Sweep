your directory

Dim fileList As String
Dim myDir As String

'Set Directory
myDir = "C:\YourDirectory"

' Get All Files
fileList = Dir(myDir & "\*.*")

Do While fileList <> ""
    If (LCase(Right$(fileList, 3)) <> "exe") Then
        Kill myDir & "\" & fileList
    End If
    fileList = Dir
Loop

' Get All Folders
fileList = Dir(myDir & "\*.*", vbDirectory)

Do While fileList <> ""
    If (Right$(fileList, 1) <> ".") Then
        If (Left$(fileList, 2) <> "..") Then
            RmDir myDir & "\" & fileList
        End If
    End If
    fileList = Dir
Loop