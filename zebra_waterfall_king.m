an array

% Clean Sweep Array

%This program will clean an input array of all elements that are larger than
%the median

% INPUT ARRAY 

inArray = [5, 8, 4, 7, 10, 1, 6, 2, 9, 3];

% STEP 1: Determine the median of the input array

medVal = median(inArray);

% STEP 2: Create a new array for output

outArray = inArray;

%Loop over the input array and delete values larger than the median

for i = 1:length(inArray)
    if (inArray(i) > medVal)
        outArray(i) = 0;
    end
end

% STEP 3: Remove unwanted zeros and recreate the output array

outArray(outArray == 0) = [];

% STEP 4: Display the output array

disp(outArray);