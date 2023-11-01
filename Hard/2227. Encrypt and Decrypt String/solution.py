class Encrypter:

    def __init__(self, keys: List[str], values: List[str], dictionary: List[str]):
        self.ktov = {}
        
        for k, v in zip(keys, values):
            self.ktov[k] = v
        
        self.count = Counter(self.encrypt(x) for x in dictionary)
        

    def encrypt(self, word1: str) -> str:
        res = []
        
        for x in word1:
            if x in self.ktov:
                res.append(self.ktov[x])
            else:
                return ""
        
        return "".join(res)

    def decrypt(self, word2: str) -> int:
        return self.count[word2]