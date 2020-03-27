#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Inserire questo file nella stessa cartella di tutti i file java
"""

import os
import subprocess
res="""s1 e' questo:
[1 ([4] [3] [2])]
s2 e' questo:
[5 ([7] [6])]
s3 e' questo:
[8 ([5 ([7] [6])] [1 ([4] [3] [2])])]
s2.sameStructure(s1): false
aggiungo [10] alla lista di s2
s2 e' questo:
[5 ([10] [7] [6])]
s2.sameStructure(s1): true
dopo s2.sommaSnapo(s1), s2 e' questo:
[6 ([14] [10] [8])]
aggiungo [11] alla lista di s2
s2.sameStructure(s1): false
mo' provo a sommare s2 con s1...
Qualcosa non va!
"""
res=res.split("\n")
def test_hw4():
    os.system("javac *.java")
    log=str(subprocess.check_output("java TestSnaporaz",shell=True))[2:-1].split("\\n")
    if log==res:
        print("L'Homework è corretto")
    else:
        print("C'è un errore\n")
        print("Elementi di differenza:")
        for i in range(len(log)):
            if log[i]!=res[i]:
                print("\n")
                print(f"Riga numero {i+1} dell'output:")
                print("Output:")
                print(log[i])
                print("Sarebbe dovuto essere:")
                print(res[i])

if __name__=="__main__":
    test_hw4()
