# An English text needs to be encrypted using the following encryption scheme.
# First, the spaces are removed from the text. Let l be the length of this text.
# Then, characters are written into a grid, whose rows and columns have the following constraints:

# ⌊l‾‾√⌋≤rows≤column≤⌈l‾‾√⌉, where ⌊x⌋ is floor function and ⌈x⌉ is ceil function

# Example:
# s = if man was meant to stay on the ground god would have given us roots
# After removing spaces, the string is 54 characters long. sqrt(54) is between 7 and 8, so it is written in the form of a grid with 7 rows and 8 columns.

# Ensure that rows×columns≥L
# If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows×columns.

# The encoded message is obtained by displaying the characters of each column, with a space between column texts. The encoded message for the grid above is:

# imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
# You will be given a message in English with no spaces between the words. The maximum message length can be characters. Print the encoded message.



Input
["Encrypter", "encrypt", "decrypt"]
[[['a', 'b', 'c', 'd'], ["ei", "zf", "ei", "am"], ["abcd", "acbd", "adbc", "badc", "dacb", "cadb", "cbda", "abad"]], ["abcd"], ["eizfeiam"]]
Output
[null, "eizfeiam", 2]

Explanation
Encrypter encrypter = new Encrypter([['a', 'b', 'c', 'd'], ["ei", "zf", "ei", "am"], ["abcd", "acbd", "adbc", "badc", "dacb", "cadb", "cbda", "abad"]);
encrypter.encrypt("abcd"); // return "eizfeiam". 
                           // 'a' maps to "ei", 'b' maps to "zf", 'c' maps to "ei", and 'd' maps to "am".
encrypter.decrypt("eizfeiam"); // return 2. 
                              // "ei" can map to 'a' or 'c', "zf" maps to 'b', and "am" maps to 'd'. 
                              // Thus, the possible strings after decryption are "abad", "cbad", "abcd", and "cbcd". 
                              // 2 of those strings, "abad" and "abcd", appear in dictionary, so the answer is 2.

