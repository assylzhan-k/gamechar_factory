# Elemental RPG Factory

## Project Description

This Java project demonstrates two creational design patterns:

- Factory Method
- Abstract Factory

The project uses an elemental RPG theme inspired by games like Genshin Impact.

---
## Final src

```
src/
│
├── ElementalCharacter.java
├── AnemoCharacter.java
├── CryoCharacter.java
│
├── CharacterCreator.java
├── AnemoCharacterCreator.java
├── CryoCharacterCreator.java
│
├── Weapon.java
├── AnemoWeapon.java
├── CryoWeapon.java
│
├── Artifact.java
├── AnemoArtifact.java
├── CryoArtifact.java
│
├── ElementFactory.java
├── AnemoFactory.java
├── CryoFactory.java
│
├── ElementType.java
├── ElementFactoryProvider.java
├── GameClient.java
└── Main.java
```

---

## Part A — Factory Method

Factory Method is used to create different types of elemental characters.

### Structure

- `ElementalCharacter` — Product interface
- `AnemoCharacter` — Concrete Product
- `CryoCharacter` — Concrete Product
- `CharacterCreator` — Creator
- `AnemoCharacterCreator` — Concrete Creator
- `CryoCharacterCreator` — Concrete Creator

Example:

```java
CharacterCreator creator = new AnemoCharacterCreator();
ElementalCharacter character = creator.createCharacter();
```

The concrete creator decides which character should be created.

---

## Part B — Abstract Factory

Abstract Factory is used to create a family of related game objects.

Each elemental family contains:

- Character
- Weapon
- Artifact

### Anemo Family

- `AnemoCharacter`
- `AnemoWeapon`
- `AnemoArtifact`

### Cryo Family

- `CryoCharacter`
- `CryoWeapon`
- `CryoArtifact`

`ElementFactory` is the Abstract Factory.

```java
public interface ElementFactory {
    ElementalCharacter createCharacter();
    Weapon createWeapon();
    Artifact createArtifact();
}
```

`AnemoFactory` and `CryoFactory` create complete matching families.

---

<img width="770" height="533" alt="Screenshot 2026-09-20 at 22 26 32" src="https://github.com/user-attachments/assets/a80cbfb2-b6d5-448f-9f8e-f532849dd5b5" />

---

## Factory Method vs Abstract Factory

**Factory Method** creates one type of product.

```text
Creator → Character
```

**Abstract Factory** creates a family of related products.

```text
Factory → Character + Weapon + Artifact
```

---

# Clean Code Principles

## 1. Meaningful Names

Before:

```java
Weapon w;
```

After:

```java
Weapon weapon;
```

Clear names make the code easier to understand.

## 2. Small Methods

Instead of putting everything inside `main()`, the program uses:

```java
runFactoryMethodDemo();
runAbstractFactoryDemo();
```

Each method has one clear task.

## 3. Focused Classes

Each class has its own responsibility.

For example:

- `AnemoFactory` creates the Anemo family.
- `CryoFactory` creates the Cryo family.
- `GameClient` uses the created products.

## 4. No Magic Strings

Before:

```java
getFactory("anemo");
```

After:

```java
getFactory(ElementType.ANEMO);
```

Using an enum reduces typing mistakes.

## 5. Validation

The client checks that the factory is valid:

```java
if (factory == null) {
    throw new IllegalArgumentException(
            "Element factory cannot be null"
    );
}
```

This prevents invalid objects from being used.
