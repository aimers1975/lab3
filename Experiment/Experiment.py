"""This is the largest function"""

def largest(mylist):
    """This checks for largest in a list, returns ValueError on empty list"""
    if len(mylist) == 0:
        raise ValueError("Cannot call largest on empty list")
    # max = -sys.maxint # "smallest" possible int
    thismax = mylist[0]
    for index in range(len(mylist)):
        if mylist[index] > thismax:
            thismax = mylist[index]
    return thismax
