#!/usr/bin/perl

use warnings;
use strict;

# Declare variables
my $directory;
my $file;
my $filepath;

# Prompt user for directory to clean
print "Please enter the directory that you want to clean:\n";
$directory = <STDIN>;
chomp $directory;

# Get a list of files in the directory
opendir (DIR, $directory) or die "Could not open directory $directory\n";
my @files = readdir (DIR);
closedir (DIR);

# Loop through each file
foreach $file (@files) {
	
	# If the file isn't a directory
	if (-f "$directory/$file") {
	
		# Construct the file path
		$filepath = "$directory/$file";
		
		# Delete the file
		unlink ($filepath);
		
		# Print the file path
		print "Removed $filepath\n";
	}
}