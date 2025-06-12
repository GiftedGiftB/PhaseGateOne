user_input = input("Enter credit card Number: ")
length = len(user_input)
first_number = user_input[0]
second_number = user_input[1]

if 12 < length < 17:
	if first_number == '4':
		print("*******************************************")
		print("**Credit Card Type: Visa Card")
	elif first_number == '5':
		print("*******************************************")
		print("**Credit Card Type: Master Card")
	elif first_number == '3' and second_number == '7':
		print("*******************************************")
		print("**Credit Card Type: American Express Card")
	elif first_number == '6':
		print("*******************************************")
		print("**Credit Card Type: Discover Card")
	else:
		print("*******************************************")
		print("**Credit Card Type: Not recognised")
	print("**Credit card Number: " + user_input)
	print("**Credit Card digit length: " + str(length))
	print("**Credit card validity status: Valid")
else:
	print("**Credit card validity status: Invalid")
print("*******************************************")