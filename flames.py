male=list(input("Enter Boy's name:").upper())
female=list(input("Enter girl's name:").upper())

for m in range(0,len(male)):
    for f in range(0,len(female)):
        if male[m]==female[f]:
            male[m]=" "
            female[f]=" "

ml=""
fl=""

for m in male:
    if m!=" ":
        ml=ml+m
for f in female:
    if f!=" ":
        fl=fl+f
    
diff= len(ml+fl)

flames="FLAMES"
temp=""

while (len(flames)!=1):
    y=diff%len(flames)
    if (y!=0):
        temp = flames[y:]+flames[:y-1]
    else:
        temp = flames[:-1]
    flames=temp
        
flames_dic={'F':"Friends",'L':"Love",'A':"Affection",'M':"Marriage",'E':"Enemies",'S':"Siblings"}
print(flames_dic[flames])
