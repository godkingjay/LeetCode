# An English text needs to be encrypted using the following encryption scheme.
# First, the spaces are removed from the text. Let l be the length of this text.
# Then, characters are written into a grid, whose rows and columns have the following constraints:

# ⌊l‾‾√⌋≤rows≤column≤⌈l‾‾√⌉, where ⌊x⌋ is floor function and ⌈x⌉ is ceil function

# Example:
# s = if man was meant to stay on the ground god would have given us roots
# After removing spaces, the string is 54 characters long. sqrt(54) is between 7 and 8, so it is written in the form of a grid with 7 rows and 8 columns.

# ifmanwas
# meanttos
# tayonthe
# groundgo
# dwouldha
# vegivenu
# sroots

# Ensure that rows×columns≥L
# If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows×columns.

# The encoded message is obtained by displaying the characters of each column, with a space between column texts. The encoded message for the grid above is:

# imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
# You will be given a message in English with no spaces between the words. The maximum message length can be characters. Print the encoded message.



# Sample Input:
# haveaniceday

# Sample Output:
# hae and via ecy

# Explanation:
# L=12,  sqrt(12) is between 3 and 4.
# Rewritten with 3 rows and 4 columns:
# have
# anic
# eday

# Sample Input: 2
# feedthedog

# Sample Output: 2
# fto ehg ee dd

# Explanation:
# L=10, sqrt(10) is between 3 and 4.
# Rewritten with 3 rows and 4 columns:
# feed
# thed
# og

