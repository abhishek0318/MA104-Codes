richter = float(input("Enter magnitude of earthquake in ritcher scale: "))
energy_released = 10 ** ((1.5 * richter) + 4.8)
tnt_equivalent = energy_released / (4.184 * (10 ** 9))
print("The energy released is {} Joules which is equivalent to explosion of {} tons TNT.".format(energy_released, tnt_equivalent))
