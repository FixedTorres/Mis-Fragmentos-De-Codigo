from os import walk

dirs = 0
for raiz, _, _ in walk("."):
    print("{0}".format(raiz))
    dirs += 1

print("\nSe han encontrado {0} directorios".format(dirs))