# Bhuseva

**Bhuseva** is a public charitable trust working to uplift society by developing an ashram, organizing daily Annadanam (serving food to 250 people every day), and distributing plants to the community. This web application is the digital front page for all our activities, offering transparent, secure, and role-based access to Donors, Visitors, Trustees, and Admins.

---

## Table of Contents

- [About](#about)
- [Features by Role](#features-by-role)
- [Tech Stack](#tech-stack)
- [Authentication & Security](#authentication--security)
- [Payments](#payments)
- [Upcoming Developments](#upcoming-developments)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

---

## About

Bhuseva's mission is to drive positive change through service, community engagement, and environmental stewardship. Our platform streamlines operations, enhances transparency, and connects all stakeholders in our charitable initiatives.

---

## Features by Role

### Donor
- Access all visitor features
- View personal donation history and transactions
- Enjoy visitor-level access to services
- Visitors who donate are automatically upgraded to donor access

### Visitor
- View available services
- See personal credit history to the charitable account
- Eligibility to upgrade to donor upon making a donation

### Trustee
- View all transactions uploaded by Admin
- Access to completed, ongoing, and upcoming plans/projects
- Review comprehensive credit and debit history

### Admin
- Upload bank statements to update transaction records
- Manage user roles and access
- Oversee all platform operations

---

## Tech Stack

- **Frontend:** React.js
- **Backend:** Java
- **Database:** PostgreSQL
- **Authentication:** JWT (JSON Web Tokens)
- **Payments:** Planned open-source, tokenized system

---

## Authentication & Security

- JWT-based authentication for secure role-based access
- Data privacy for sensitive information
- Automatic role elevation for visitors who become donors

---

## Payments

We plan to integrate an open-source, tokenized payment system to enable secure, transparent, and traceable donations. All transactions will be automatically reflected in user accounts according to their roles.

---

## Upcoming Developments

- **Media Gallery:** Users can view photos and video footage from various charitable activities based on their roles.
- **Service Funding Menus:** Each service page will display the required funding amount, progress, and related details.
- **Enhanced Dashboards:** Advanced analytics for Trustees and Admins.
- **Modern UI/UX:** Continuous improvements for accessibility and responsiveness.

---

## Getting Started

1. **Clone the repository:**
    ```bash
    git clone https://github.com/dasariyadhesh/bhuseva.git
    cd bhuseva
    ```

2. **Backend Setup:**
    - Ensure Java and PostgreSQL are installed.
    - Configure your database credentials in the backend configuration file.
    - Install dependencies and run the backend server.

3. **Frontend Setup:**
    - Navigate to the frontend directory if separate.
    - Install dependencies:
      ```bash
      npm install
      ```
    - Start the development server:
      ```bash
      npm start
      ```

4. **Environment Variables:**
    - Set up environment variables for database, JWT, and payment system as required.

---

## Contributing

We welcome contributions from the community!  
To contribute:

1. Fork the repository and create your branch (`git checkout -b feature/feature-name`)
2. Commit your changes (`git commit -am 'Add new feature'`)
3. Push to the branch (`git push origin feature/feature-name`)
4. Open a Pull Request

---

## License

This project is licensed under the MIT License.

---

## Contact

For questions or support, please open an issue or contact the repository owner.

---

*Thank you for supporting Bhuseva and helping us serve the community!*

---

You can now copy and save this as `README.md`, stage, commit, and push it to your repository. If you need help with the Git commands, just ask!
