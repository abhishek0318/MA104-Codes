names = ['Alice', 'Bob', 'Cathy', 'Dan', 'Ed', 'Frank', 'Gary', 'Helen','Irene', 'Jack', 'Kelly', 'Larry']
ages = [20, 21, 18, 18, 19, 20, 20, 19, 19, 19, 22, 19]

def combine(names, ages):
    combined_dict = {}
    for i in range(len(names)):
        combined_dict[names[i]] = ages[i]
    return combined_dict

dictionary = combine(names, ages)

def people(age):
    list_of_people = []
    for key in dictionary.keys():
        if dictionary[key] == age:
            list_of_people.append(key)
    return list_of_people

print(people(18), "\n", people(19), "\n", people(20), "\n", people(21) == ['Bob'], "\n", people(22) == ['Kelly'], "\n", people(23) == [])
