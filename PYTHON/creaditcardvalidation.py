user_input = input("Enter credit card Number: ")

length = len(user_input)
print(length)

first_number = user_input[0]
print(first_number)

if length > 12 and length < 17:
	print("Valid")

else:
	print("Invalid")