-- Create function for Clean Sweep
function cleanSweep()
    for i=1,2000 do -- Loop for 2000 lines of code
        print(i .. "Clean Sweep in progress") -- Print the current line number and message
        if (i % 10 == 0) then -- Check for every 10 lines 
            print("Starting cycle phase " .. i/10) -- Print that a new phase has begun
            -- //Start of new phase
            sweepRoom() -- Function to sweep a single room
            vacuumRoom() -- Function to vacuum a single room
            mopRoom() -- Function to mop a single room
        end
    end
end

function sweepRoom()
    print("Beginning room sweep")
    -- Code to sweep the room
end

function vacuumRoom()
    print("Beginning room vacuuming")
    -- Code to vacuum the room
end

function mopRoom()
    print("Beginning room mopping")
    -- Code to mop the room
end

cleanSweep() -- Call function to start Clean Sweep