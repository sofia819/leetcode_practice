"""
804. Unique Morse Code Words
https://leetcode.com/problems/unique-morse-code-words/
"""

class Solution(object):
    def uniqueMorseRepresentations(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        
        wordSet = set()
        for w in words:
            mo = ""
            for c in w:
                mo += morse[ord(c) - 97]
            wordSet.add(mo)
                    
        return len(wordSet)