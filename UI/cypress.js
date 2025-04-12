describe('Login Page Test', () => {
    it('should log in and land on dashboard', () => {
      cy.visit('www.example.com/login');
  
      cy.get('username').type('admin');
      cy.get('password').type('password123');
      cy.get('loginButton').click();
  
      cy.get('dashbord', { timeout: 10000 }).expect('visible');
    });
  });
  