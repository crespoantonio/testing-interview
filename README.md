# 🧪 Automation Testing Interview - Evaluator Guide

This repository is intended for **interviewers and evaluators** conducting technical interviews for automation testing roles.

It contains a variety of intentionally flawed code samples in multiple languages and frameworks. These are designed to assess a candidate’s ability to:

- Analyze code
- Identify bugs and bad practices
- Communicate technical findings
- Suggest improvements and best practices

---

## 🧭 How to Use This Repo

Each file contains **1 or more intentional issues**. The candidate will be presented with one or more files during the interview and asked to:

1. **Read and understand the code**
2. **Identify all issues and explain their impact**
3. **Propose fixes or improvements**
4. Optionally: Suggest how the code could be refactored or scaled

These exercises are designed to be **framework-agnostic** and **non-runnable**. Execution is not necessary — evaluation is based on critical thinking and communication.

---

## 📁 Folder Structure

### `API/`
- API test cases in different tools/languages
- Includes typos, incorrect HTTP methods, missing validations, etc.

### `logic/`
- General-purpose logic problems (array reversal, palindrome, pair sum)
- Implemented in Java, JS, and Python with hidden logic flaws

### `UI/`
- UI automation examples using Selenium, Cypress, and Playwright in different languages
- Issues include typos in element locators, broken waits, incorrect URL formats, etc.

### `bdd/`
- Gherkin `.feature` files with intentional BDD anti-patterns
- Examples include:
  - Multiple actions in one step
  - Vague assertions
  - Broken scenario structure (e.g. `Given` after `Then`)
  - Mismatched scenario outlines and Examples tables

### `requirements/`
- Contains vague or ambiguous User Stories
- Designed to evaluate the candidate’s ability to:
  - Ask clarifying questions
  - Identify missing information
  - Spot potential risks before testing begins

---

## 🧠 Evaluation Areas

You should focus on the following during evaluation:

| Category | What to Look For |
|----------|------------------|
| **Bug Spotting** | Can they find the typos and logical mistakes? |
| **Tool Fluency** | Do they know how the tool is *supposed* to work? |
| **Reasoning** | Can they explain why something is incorrect? |
| **Communication** | Are they clear and confident when walking you through it? |
| **Best Practices** | Do they mention scalability, readability, or maintenance concerns? |

---

## 🔍 What to Ask the Candidate

Here are some sample questions to guide the conversation:

- Can you walk me through what this code is trying to do?
- Do you notice anything incorrect or problematic?
- What would happen if this test ran in a real CI/CD pipeline?
- How would you improve the structure of this code?
- Are there any industry best practices that could be applied here?
- If you were maintaining this test long-term, what would you change?

---

## 🧩 Exercise Selection Tips

- Use **UI** or **API** examples based on the candidate’s experience
- Use **logic** exercises to evaluate raw problem-solving ability
- Pick **one** file to start — then increase difficulty if needed
- Do not hint at the bugs — let them reason it out

---

## ✅ Notes for You (The Interviewer)

- These files are **not meant to run**
- **Do not fix the errors in this repo**
- Encourage the candidate to explain *why* something is wrong, not just that it is
- Take note of how they think and explain, not just what they say

---

## ✨ Bonus Behaviors to Look For

- Refactoring ideas (e.g., extract to function, use waits properly, parametrize data)
- Awareness of test flakiness or maintainability
- Discussing broader testing strategies beyond the file shown
- Asking questions to clarify requirements or context

---

## 💬 Final Interview Advice

This is not a speed round. Let the candidate **think aloud**, ask questions, and show how they process code.

You're not just looking for someone who can code — you're evaluating their ability to think like a tester and communicate like a teammate.

---

**Maintainers**: Tony
**Version**: Internal Interview Materials v1.0  
