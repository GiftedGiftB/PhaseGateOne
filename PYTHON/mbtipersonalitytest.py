print("""
		MBTI PERSONALITY TEST
""")

print("mbtipersonalitytest __name__:", __name__)


def main():
    judging_perceiving = get_judging_perceiving()
    extraversion_introversion = get_extraversion_introversion()
    thinking_feeling = get_thinking_feeling()
    sensing_intuition = get_sensing_intuitioSn()
    personality_type = sensing_intuition + extraversion_introversion + thinking_feeling + judging_perceiving
    print("\nYour personality type is:", personality_type)

def get_judging_perceiving():
    print("\nWhen working on a project, what motivates you more?")
    print("A. Breaking down the task into smaller, manageable parts and creating a schedule.")
    print("B. Brainstorming new ideas and exploring different possibilities.")
    choice = input("\nEnter your choice (A/B): ").upper()
    if choice == "A":
        return "J"
    else:
        return "P"

def get_extraversion_introversion():
    print("\nIn social situations, how do you typically feel?")
    print("A. Energized and enthusiastic, enjoying the company of others.")
    print("B. Reserved and reflective, preferring to observe before contributing.")
    choice = input("\nEnter your choice (A/B): ").upper()
    if choice == "A":
        return "E"
    else:
        return "I"

def get_thinking_feeling():
    print("\nWhen making decisions, what do you prioritize?")
    print("A. Logical analysis and objective criteria.")
    print("B. Personal values and the impact on others.")
    choice = input("\nEnter your choice (A/B): ").upper()
    if choice == "A":
        return "T"
    else:
        return "F"

def get_sensing_intuition():
    print("\nWhen solving problems, what approach do you typically take?")
    print("A. Focusing on concrete facts and details.")
    print("B. Exploring abstract ideas and patterns.")
    choice = input("\nEnter your choice (A/B): ").upper()
    if choice == "A":
        return "S"
    else:
        return "N" 

def get_adaptability():
    print("\nHow do you handle unexpected changes in plans?")
    print("A. Adapting quickly and flexibly.")
    print("B. Preferring to stick to the original plan.")
    choice = input("\nEnter your choice (A/B): ").upper()
    if choice == "A":
        return "P"
    else:
        return "J"

if __name__ == "__main__":
    main()
