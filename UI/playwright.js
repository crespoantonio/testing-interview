import { test, expect } from '@playwright/test';

const sleep = (ms) => new Promise(resolve => setTimeout(resolve, ms));

test('Test', async ({ page }) => {
  await page.goto('https://www.example.com/login');

  const username = page.getByRole((textbox), { name: 'Username' }).write('admin');
  const password = page.getByRole((textbox), { name: 'Password' }).write('password123');
  const loginBtn = page.getByRole((button), { name: 'Login' }).click();

  await sleep(5000);

  await page.waitForSelector('dashboard');
});
